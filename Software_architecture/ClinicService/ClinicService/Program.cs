using ClinicService.Services;
using ClinicService.Services.Impl;
using System.Data.SQLite;

namespace ClinicService
{
    // https://sqlitestudio.pl/
    public class Program
    {
        public static void Main(string[] args)
        {
            //ConfigureSqlLiteConnection();

            var builder = WebApplication.CreateBuilder(args);

            // Add services to the container.

            builder.Services.AddScoped<IClientRepository, ClientRepository>();
            builder.Services.AddScoped<IPetRepository, PetRepository>();
            builder.Services.AddScoped<IConsultationRepository, ConsultationRepository>();

            builder.Services.AddControllers();
            // Learn more about configuring Swagger/OpenAPI at https://aka.ms/aspnetcore/swashbuckle
            builder.Services.AddEndpointsApiExplorer();
            builder.Services.AddSwaggerGen();

            var app = builder.Build();

            // Configure the HTTP request pipeline.
            if (app.Environment.IsDevelopment())
            {
                app.UseSwagger();
                app.UseSwaggerUI();
            }

            app.UseAuthorization();


            app.MapControllers();

            app.Run();
        }


        private static void ConfigureSqlLiteConnection()
        {
            const string connectionString = "Data Source = clinic.db; Version = 3; Pooling = true; Max Pool Size = 100;";
            SQLiteConnection connection = new SQLiteConnection(connectionString);
            connection.Open();
            PrepareScheme(connection);

        }

        private static void PrepareScheme(SQLiteConnection connection)
        {
            SQLiteCommand command = new SQLiteCommand(connection);

            //command.CommandText = "DROP TABLE IF EXISTS consultations";
            //command.ExecuteNonQuery();
            //command.CommandText = "DROP TABLE IF EXISTS pets";
            //command.ExecuteNonQuery();
            //command.CommandText = "DROP TABLE IF EXISTS clients";
            //command.ExecuteNonQuery();


            command.CommandText = @"CREATE TABLE Clients(ClientId INTEGER PRIMARY KEY,
                    Document TEXT,
                    SurName TEXT,
                    FirstName TEXT,
                    Patronymic TEXT,
                    Birthday INTEGER)";
            command.ExecuteNonQuery();
            command.CommandText =
                    @"CREATE TABLE Pets(PetId INTEGER PRIMARY KEY,
                    ClientId INTEGER,
                    Name TEXT,
                    Birthday INTEGER)";
            command.ExecuteNonQuery();
            command.CommandText =
                @"CREATE TABLE Consultations(ConsultationId INTEGER PRIMARY KEY,
                    ClientId INTEGER,
                    PetId INTEGER,
                    ConsultationDate INTEGER,
                    Description TEXT)";
            command.ExecuteNonQuery();
            connection.Close();
        }
    }
}