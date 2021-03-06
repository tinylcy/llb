package org.tinylcy.chain;

import java.io.Serializable;
import java.util.List;

/**
 * Created by tinylcy.
 */
public class Block implements Serializable {

    /* Summary */
    private Integer size;                        // Block size
    private Long timestamp;                      // Timestamp
    private Long nonce;                          // Nonce for Proof-of-Work
    private Integer height;                      // Height

    /* Hashes */
    private String merkleRoot;                   // Merkle-Tree root's hash
    private String prevBlockHash;                // The previous block's hash

    /* Transactions */
    private List<Transaction> transactions;      // Transactions

    public Block() {
        this.nonce = 0L;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public Long getNonce() {
        return nonce;
    }

    public void setNonce(Long nonce) {
        this.nonce = nonce;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public String getMerkleRoot() {
        return merkleRoot;
    }

    public void setMerkleRoot(String merkleRoot) {
        this.merkleRoot = merkleRoot;
    }

    public String getPrevBlockHash() {
        return prevBlockHash;
    }

    public void setPrevBlockHash(String prevBlockHash) {
        this.prevBlockHash = prevBlockHash;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    @Override
    public String toString() {
        return "Block{" +
                "size=" + size +
                ", timestamp=" + timestamp +
                ", nonce=" + nonce +
                ", height=" + height +
                ", merkleRoot='" + merkleRoot + '\'' +
                ", prevBlockHash='" + prevBlockHash + '\'' +
                ", transactions=" + transactions +
                '}';
    }
}
