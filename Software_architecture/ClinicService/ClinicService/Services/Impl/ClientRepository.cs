using ClinicService.Models;
using System.Data.SQLite;

namespace ClinicService.Services.Impl
{
    public class ClientRepository : IClientRepository
    {
        private const string connectionString = "Data Source = clinic.db; Version = 3; Pooling = true; Max Pool Size = 100;";

        public int Create(Client item)
        {
            SQLiteConnection connection = new SQLiteConnection(connectionString);
            try
            {
                connection.Open();
                // Прописываем в команду SQL-запрос на добавление данных
                SQLiteCommand command = new SQLiteCommand(connection);
                command.CommandText = "INSERT INTO clients(Document, SurName, FirstName, Patronymic, Birthday) VALUES(@Document, @SurName, @FirstName, @Patronymic, @Birthday)";
                command.Parameters.AddWithValue("@Document", item.Document);
                command.Parameters.AddWithValue("@SurName", item.SurName);
                command.Parameters.AddWithValue("@FirstName", item.FirstName);
                command.Parameters.AddWithValue("@Patronymic", item.Patronymic);
                command.Parameters.AddWithValue("@Birthday", item.Birthday.Ticks);
                // подготовка команды к выполнению
                command.Prepare();
                // Выполнение команды
                return command.ExecuteNonQuery();
            }
            catch
            {
                return 0;
            }
            finally
            {
                connection.Close();
            }
        }

        public int Update(Client item)
        {
            SQLiteConnection connection = new SQLiteConnection(connectionString);
            try
            {
                connection.Open();
                // Прописываем в команду SQL-запрос на обновление данных
                SQLiteCommand command = new SQLiteCommand(connection);
                command.CommandText = "UPDATE clients SET Document = @Document, FirstName = @FirstName, SurName = @SurName, Patronymic = @Patronymic, Birthday = @Birthday WHERE ClientId=@ClientId";
                command.Parameters.AddWithValue("@ClientId", item.ClientId);
                command.Parameters.AddWithValue("@Document", item.Document);
                command.Parameters.AddWithValue("@SurName", item.SurName);
                command.Parameters.AddWithValue("@FirstName", item.FirstName);
                command.Parameters.AddWithValue("@Patronymic", item.Patronymic);
                command.Parameters.AddWithValue("@Birthday", item.Birthday.Ticks);
                // подготовка команды к выполнению
                command.Prepare();
                // Выполнение команды
                return command.ExecuteNonQuery();
            }
            catch
            {
                return 0;
            }
            finally
            {
                connection.Close();
            }
        }

        public int Delete(int id)
        {
            SQLiteConnection connection = new SQLiteConnection(connectionString);
            try
            {
                connection.Open();
                // Прописываем в команду SQL-запрос на удаление данных
                SQLiteCommand command = new SQLiteCommand(connection);
                command.CommandText = "DELETE FROM clients WHERE ClientId=@ClientId";
                command.Parameters.AddWithValue("@ClientId", id);
                // подготовка команды к выполнению
                command.Prepare();
                // Выполнение команды
                return command.ExecuteNonQuery();
            }
            catch
            {
                return 0;
            }
            finally
            {
                connection.Close();
            }
        }

        public IList<Client> GetAll()
        {
            SQLiteConnection connection = new SQLiteConnection(connectionString);
            List<Client> list = new List<Client>();
            try
            {
                connection.Open();
                // Прописываем в команду SQL-запрос на получение данных
                SQLiteCommand command = new SQLiteCommand(connection);
                command.CommandText = "SELECT * FROM clients";
                // подготовка команды к выполнению
                command.Prepare();
                // Выполнение команды
                SQLiteDataReader reader = command.ExecuteReader();
                while (reader.Read())
                {
                    Client client = new Client
                    {
                        ClientId = reader.GetInt32(0),
                        Document = reader.GetString(1),
                        SurName = reader.GetString(2),
                        FirstName = reader.GetString(3),
                        Patronymic = reader.GetString(4),
                        Birthday = new DateTime(reader.GetInt64(5))
                    };

                    list.Add(client);
                }
            }
            finally
            {
                connection.Close();
            }
            return list;
        }

        public Client GetById(int id)
        {
            SQLiteConnection connection = new SQLiteConnection(connectionString);
            try
            {
                connection.Open();
                // Прописываем в команду SQL-запрос на получение данных по конкретному клиенту
                SQLiteCommand command = new SQLiteCommand(connection);
                command.CommandText = "SELECT * FROM clients WHERE ClientId=@ClientId";
                command.Parameters.AddWithValue("@ClientId", id);
                // подготовка команды к выполнению
                command.Prepare();
                // Выполнение команды
                SQLiteDataReader reader = command.ExecuteReader();
                if (reader.Read()) // Если удалось что-то прочитать
                {
                    // возвращаем прочитанное
                    return new Client
                    {
                        ClientId = reader.GetInt32(0),
                        Document = reader.GetString(1),
                        SurName = reader.GetString(2),
                        FirstName = reader.GetString(3),
                        Patronymic = reader.GetString(4),
                        Birthday = new DateTime(reader.GetInt64(5))
                    };
                }
                else
                {
                    // Не нашлась запись по идентификатору
                    return null;
                }
            }
            finally
            {
                connection.Close();
            }
        }

    }
}
