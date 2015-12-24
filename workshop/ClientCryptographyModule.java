package workshop;

public interface ClientCryptographyModule {
	
	/**
	 * Encrypts the message using ElGamal.
	 * @param publicKey The key published by the BB.
	 * @param message The message to encrypt.
	 * @return A byte array containing the ciphertext. 
	 */
	public static byte[] encrypt(Key publicKey, byte[] message);   
	
	//TODO (ZKP)
	
	/**
	 * Create the signatue passed to the BB using Diffie-Helman.
	 * @param privateKey The party's key, given physically by the infrastructure team.
	 * @param message The message to encrypt.
	 * @return The signature's ciphertext.
	 */
	public static Certificate sign(Key privateKey, byte[] message);
	
	/**
	 * Verify a certificate of an encrypted message.
	 * @param publicKey The signing party's public key.
	 * @param encryptedMessage 
	 * @param certificate
	 */
	public static boolean verifyCertificate(
			Key publicKey, byte[] encryptedMessage, Certificate certificate);

}
