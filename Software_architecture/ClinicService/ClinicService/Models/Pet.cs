namespace ClinicService.Models
{
    public class Pet
    {
        public int PetId { get; set; }

        public int ClientId { get; set; }

        public string Name { get; set; }

        public DateTime Birthday { get; set; }
    }
}
