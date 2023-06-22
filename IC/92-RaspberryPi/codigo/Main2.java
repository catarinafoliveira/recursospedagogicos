public class Main2{
	public static void main(String args[]) throws InterruptedException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rpi_teste", "root", "idc2022");

			System.out.println("<--Pi4J--> GPIO Listen Example ... started.");
			final GpioController gpio = GpioFactory.getInstance();
			final GpioPinDigitalInput myButton = gpio.provisionDigitalInputPin(RaspiPin.GPIO_02, PinPullResistance.PULL_DOWN);
			myButton.setShutdownOptions(true);
			myButton.addListener(
					new GpioPinListenerDigital() {
				@Override
				public void handleGpioPinDigitalStateChangeEvent(GpioPinDigitalStateChangeEvent event) {
					SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
					Date date = new Date(System.currentTimeMillis());
					System.out.println(formatter.format(date) + ", " + event.getPin() + ", " + event.getState());

					String query = "INSERT INTO registo(datahora, pino, estado) values(?,?,?)";
					
					try {
						PreparedStatement ps = con.prepareStatement(query);
						ps.setString(1, formatter.format(date));
						ps.setString(2, event.getPin().toString());
						ps.setString(3, event.getState().toString());
						ps.execute();
					} catch (SQLException ex) {
						Logger.getLogger(ControlGpioExample2.class.getName()).log(Level.SEVERE, null, ex);
					}
				}
			}
			);   
		} catch (Exception e) {
			System.out.println(e);
		}

		while (true) {
			Thread.sleep(500);
		}
	}
}