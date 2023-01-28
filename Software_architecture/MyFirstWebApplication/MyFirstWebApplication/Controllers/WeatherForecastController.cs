using Microsoft.AspNetCore.Mvc;
using MyFirstWebApplication.Models;

namespace MyFirstWebApplication.Controllers
{


    [Route("api/weather")]
    [ApiController]
    public class WeatherForecastController : ControllerBase
    {

        private WeatherHolder holder;

        public WeatherForecastController(WeatherHolder holder)
        {
            this.holder = holder;
        }


        [HttpPost("add")]
        public IActionResult Add(DateTime date, int temperatureC)
        {
            holder.Add(date, temperatureC);
            return Ok();

        }

        [HttpPut("update")]
        public IActionResult Update(DateTime date, int temperatureC)
        {
            holder.Update(date, temperatureC);
            return Ok();
        }

        [HttpDelete("delete")]
        public IActionResult Delete(DateTime date)
        {
            return Ok();
        }

        [HttpGet("get")]
        public ActionResult<List<WeatherForecast>> Get(DateTime dateFrom, DateTime dateTo)
        {
            List<WeatherForecast>  list = holder.Get(dateFrom, dateTo);
            return Ok(list);
        }

    }
}
