namespace ClinicService.Models.Requests
{
    public class UpdateClientRequest
    {
        public int ClientId { get; set; }
        public string Document { get; set; }

        public string SurName { get; set; }

        public string FirstName { get; set; }

        public string Patronymic { get; set; }

        public DateTime Birthday { get; set; }
    }
}
