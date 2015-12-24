package workshop;

public abstract class Certificate {
	
	public Certificate(byte[] rawCertificate) {}
	
	public abstract byte[] toByteArray();

}
