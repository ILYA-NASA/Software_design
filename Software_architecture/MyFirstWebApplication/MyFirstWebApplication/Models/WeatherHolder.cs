namespace MyFirstWebApplication.Models
{
    public class WeatherHolder
    {
        private List<WeatherForecast> _values;

        public WeatherHolder()
        {
            _values = new List<WeatherForecast>();
        }

        /// <summary>
        /// Добавить новый показатель температуры
        /// </summary>
        /// <param name="date">Дата фиксации показателя температуры</param>
        /// <param name="temperatureC">Показатель температуры</param>
        public void Add(DateTime date, int temperatureC)
        {
            _values.Add(new WeatherForecast(date, temperatureC));
            
        }

        /// <summary>
        /// Обновить показатель температуры
        /// </summary>
        /// <param name="date">Дата фиксации показания температуры</param>
        /// <param name="temperatureC">Новый показатель температуры</param>
        public void Update(DateTime date, int temperatureC)
        {
            foreach(WeatherForecast item in _values)
            {
                if (item.Date == date)
                {
                    item.TemperatureC = temperatureC;
                    return;
                }
            }
        }

        /// <summary>
        /// Получить показатели температуры за временной период
        /// </summary>
        /// <param name="dateFrom">Начальная дата</param>
        /// <param name="dateTo">Конечная дата</param>
        /// <returns></returns>
        public List<WeatherForecast> Get(DateTime dateFrom, DateTime dateTo)
        {
            /*List<WeatherForecast> list = new List<WeatherForecast>();

            foreach (WeatherForecast item in _values)
            {
                if (item.Date >= dateFrom && item.Date <= dateTo)
                {
                    list.Add(item);
                }
            }
            return list;*/

            return _values.FindAll(item => item.Date >= dateFrom && item.Date <= dateTo);
            
        }

        /// <summary>
        /// ДОМАШНЯЯ РАБОТА
        /// 
        /// Доработать метод Delete
        /// 
        /// </summary>
        /// <param name="date"></param>
        public void Delete(DateTime date)
        {

        }

    }
}
