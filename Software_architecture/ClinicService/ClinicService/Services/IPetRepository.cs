using ClinicService.Models;

namespace ClinicService.Services
{
    public interface IPetRepository : IRepository<Pet, int>
    {
    }
}
