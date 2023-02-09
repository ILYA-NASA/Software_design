using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using ClinicServiceClientNamespace;

namespace ClinicDesctop
{
    /// <summary>
    /// ДОМАШНЕЕ ЗАДАНИЕ:
    /// 
    /// Разработать приложение ClinicDesctop, подключить ClinicService к вашему клиентскому приложению. 
    /// </summary>
    public partial class MainForm : Form
    {
        public MainForm()
        {
            InitializeComponent();


            
        }

        private void buutonLoadClients_Click(object sender, EventArgs e)
        {
            ClinicServiceClient clinicServiceClient = new ClinicServiceClient("http://localhost:5221/",
                new System.Net.Http.HttpClient());

            ICollection<Client> clients = clinicServiceClient.ClientGetAllAsync().Result;

            listViewClients.Items.Clear();

            foreach (Client client in clients)
            {
                ListViewItem item = new ListViewItem();
                item.Text = client.ClientId.ToString();

                ListViewItem.ListViewSubItem surNameItem = new ListViewItem.ListViewSubItem();
                surNameItem.Text = client.SurName;

                item.SubItems.Add(surNameItem);

                ListViewItem.ListViewSubItem nameItem = new ListViewItem.ListViewSubItem();
                nameItem.Text = client.FirstName;

                item.SubItems.Add(nameItem);

                ListViewItem.ListViewSubItem patronymicItem = new ListViewItem.ListViewSubItem();
                patronymicItem.Text = client.Patronymic;

                item.SubItems.Add(patronymicItem);


                listViewClients.Items.Add(item);
            }

        }

        private void button1_Click(object sender, EventArgs e)
        {
            ClinicServiceClient clinicServiceClient = new ClinicServiceClient("http://localhost:5221/",
               new System.Net.Http.HttpClient());


            CreateClientRequest request = new CreateClientRequest();
            request.SurName = textBox1.Text;
            request.FirstName = textBox2.Text;
            request.Patronymic = textBox3.Text;
            request.Document = textBox4.Text;
            request.Birthday = DateTime.Now;

            int res = clinicServiceClient.ClientCreateAsync(request).Result;
        }
    }

}
