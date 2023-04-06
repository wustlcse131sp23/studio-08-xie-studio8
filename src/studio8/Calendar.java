package studio8;

import java.util.HashSet;
import java.util.Set;

public class Calendar {
	private Set<Appointment> appointments;

	public Calendar() {
		appointments = new HashSet<>();
	}

	public void addAppointment(Appointment appointment) {
		appointments.add(appointment);
	}

	public void removeAppointment(Appointment appointment) {
		appointments.remove(appointment);
	}

	public boolean hasAppointment(Appointment appointment) {
		return appointments.contains(appointment);
	}

	// More methods as needed, such as findAppointmentsByDate, findAppointmentsByTime, etc.

	public String toString() {
		return "Calendar{" +
				"appointments=" + appointments +
				'}';
	}
}


