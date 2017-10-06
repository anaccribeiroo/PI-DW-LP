/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author Ana Ribeiro
 */
@Entity
@Table(name = "artigo")
@NamedQueries({
    @NamedQuery(name = "Artigo.findAll", query = "SELECT a FROM Artigo a")})
public class Artigo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 100)
    @Column(name = "titulo")
    private String titulo;
    @Column(name = "ano_public")
    private Integer anoPublic;
    @Size(max = 100)
    @Column(name = "descricao")
    private String descricao;
    @JoinTable(name = "autor_has_artigo", joinColumns = {
        @JoinColumn(name = "artigo_id", referencedColumnName = "id")}, inverseJoinColumns = {
        @JoinColumn(name = "autor_id_autor", referencedColumnName = "id_autor")})
    @ManyToMany
    private List<Autor> autorList;
    @JoinColumn(name = "genero_id_genero", referencedColumnName = "id_genero")
    @ManyToOne(optional = false)
    private Genero generoIdGenero;

    public Artigo() {
    }

    public Artigo(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getAnoPublic() {
        return anoPublic;
    }

    public void setAnoPublic(Integer anoPublic) {
        this.anoPublic = anoPublic;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Autor> getAutorList() {
        return autorList;
    }

    public void setAutorList(List<Autor> autorList) {
        this.autorList = autorList;
    }

    public Genero getGeneroIdGenero() {
        return generoIdGenero;
    }

    public void setGeneroIdGenero(Genero generoIdGenero) {
        this.generoIdGenero = generoIdGenero;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Artigo)) {
            return false;
        }
        Artigo other = (Artigo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Artigo[ id=" + id + " ]";
    }
    
}
