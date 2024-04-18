package br.com.fiap.checkpoint2.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "consultas")
public class Consulta extends AbstractEntity<Long> {
	
	@ManyToOne
	@JoinColumn(name = "profissional_id")
	private Profissional profissional;
	
	@ManyToOne
	@JoinColumn(name = "paciente_id")
	private Paciente paciente;
	
	@Column(nullable = false, columnDefinition = "DATE")
	private LocalDateTime data_consulta;
	
	@Enumerated(EnumType.STRING)
	@Column(nullable = false, length = 2)
	private StatusConsulta status_consulta;
	
	@Column(length = 24)
	private int quantidade_horas;
	
	@Column(columnDefinition = "NUMERIC(15,2)")
	private BigDecimal valor_consulta;

	
	public Profissional getProfissional() {
		return profissional;
	}

	public void setProfissional(Profissional profissional) {
		this.profissional = profissional;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public LocalDateTime getData_consulta() {
		return data_consulta;
	}

	public void setData_consulta(LocalDateTime data_consulta) {
		this.data_consulta = data_consulta;
	}

	public StatusConsulta getStatus_consulta() {
		return status_consulta;
	}

	public void setStatus_consulta(StatusConsulta status_consulta) {
		this.status_consulta = status_consulta;
	}

	public int getQuantidade_horas() {
		return quantidade_horas;
	}

	public void setQuantidade_horas(int quantidade_horas) {
		this.quantidade_horas = quantidade_horas;
	}

	public BigDecimal getValor_consulta() {
		return valor_consulta;
	}

	public void setValor_consulta(BigDecimal valor_consulta) {
		this.valor_consulta = valor_consulta;
	}
	
	
	
	
}
