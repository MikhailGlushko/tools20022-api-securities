/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.area.semt;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.SecuritiesManagementLatestVersion;
import com.tools20022.repository.choice.PortfolioBalance1;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * An account servicer sends a TotalPortfolioValuationReport to an account owner
 * to provide detailed valuation information for a portfolio.<br>
 * <b>Usage</b><br>
 * The TotalPortfolioValuationReport will be sent by the account servicer to the
 * account owner on an agreed basis. The report may also be requested using a
 * SecuritiesStatementQuery.<br>
 * The TotalPortfolioValuationReport is used to report on a portfolio without
 * Investment Funds; or to report on a portfolio when an investment fund is
 * regarded as a portfolio containing, only one or multiple investment funds<br>
 * The TotalPortfolioValuationReport may also be used to:<br>
 * - re-send a message previously sent (the CopyDuplicate value is DUPL),<br>
 * - provide a third party with a copy of a message for information (the
 * CopyDuplicate value is COPY),<br>
 * - re-send to a third party a copy of a message for information (the
 * CopyDuplicate value is CODU).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.TotalPortfolioValuationReportV01#mmPagination
 * TotalPortfolioValuationReportV01.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.TotalPortfolioValuationReportV01#mmReportGeneralDetails
 * TotalPortfolioValuationReportV01.mmReportGeneralDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.TotalPortfolioValuationReportV01#mmAccountDetails
 * TotalPortfolioValuationReportV01.mmAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.TotalPortfolioValuationReportV01#mmTotalPortfolioValuation
 * TotalPortfolioValuationReportV01.mmTotalPortfolioValuation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.TotalPortfolioValuationReportV01#mmBalance
 * TotalPortfolioValuationReportV01.mmBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.TotalPortfolioValuationReportV01#mmSupplementaryData
 * TotalPortfolioValuationReportV01.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "TtlPrtflValtnRpt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesManagementLatestVersion
 * SecuritiesManagementLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code semt.024.001.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TotalPortfolioValuationReportV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nAn account servicer sends a TotalPortfolioValuationReport to an account owner to provide detailed valuation information for a portfolio.\r\nUsage\r\nThe TotalPortfolioValuationReport will be sent by the account servicer to the account owner on an agreed basis. The report may also be requested using a SecuritiesStatementQuery.\r\nThe TotalPortfolioValuationReport is used to report on a portfolio without Investment Funds; or to report on a portfolio when an investment fund is regarded as a portfolio containing, only one or multiple investment funds\r\nThe TotalPortfolioValuationReport may also be used to:\r\n- re-send a message previously sent (the CopyDuplicate value is DUPL),\r\n- provide a third party with a copy of a message for information (the CopyDuplicate value is COPY),\r\n- re-send to a third party a copy of a message for information (the CopyDuplicate value is CODU)."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TotalPortfolioValuationReportV01", propOrder = {"pagination", "reportGeneralDetails", "accountDetails", "totalPortfolioValuation", "balance", "supplementaryData"})
public class TotalPortfolioValuationReportV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Pgntn", required = true)
	protected Pagination pagination;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Pagination
	 * Pagination}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pgntn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pagination"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Page number of the message (within the report) and continuation indicator to indicate that the report is to continue or that the message is the last page of the report."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<TotalPortfolioValuationReportV01, Pagination> mmPagination = new MMMessageBuildingBlock<TotalPortfolioValuationReportV01, Pagination>() {
		{
			xmlTag = "Pgntn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pagination";
			definition = "Page number of the message (within the report) and continuation indicator to indicate that the report is to continue or that the message is the last page of the report.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Pagination.mmObject();
		}

		@Override
		public Pagination getValue(TotalPortfolioValuationReportV01 obj) {
			return obj.getPagination();
		}

		@Override
		public void setValue(TotalPortfolioValuationReportV01 obj, Pagination value) {
			obj.setPagination(value);
		}
	};
	@XmlElement(name = "RptGnlDtls", required = true)
	protected Report4 reportGeneralDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Report4 Report4}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptGnlDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportGeneralDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "General information related to the total portfolio valuation report."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<TotalPortfolioValuationReportV01, Report4> mmReportGeneralDetails = new MMMessageBuildingBlock<TotalPortfolioValuationReportV01, Report4>() {
		{
			xmlTag = "RptGnlDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportGeneralDetails";
			definition = "General information related to the total portfolio valuation report.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Report4.mmObject();
		}

		@Override
		public Report4 getValue(TotalPortfolioValuationReportV01 obj) {
			return obj.getReportGeneralDetails();
		}

		@Override
		public void setValue(TotalPortfolioValuationReportV01 obj, Report4 value) {
			obj.setReportGeneralDetails(value);
		}
	};
	@XmlElement(name = "AcctDtls", required = true)
	protected SecuritiesAccount21 accountDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount21
	 * SecuritiesAccount21}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details of the account. The account may represent an investment portfolio or a fund."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<TotalPortfolioValuationReportV01, SecuritiesAccount21> mmAccountDetails = new MMMessageBuildingBlock<TotalPortfolioValuationReportV01, SecuritiesAccount21>() {
		{
			xmlTag = "AcctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountDetails";
			definition = "Details of the account. The account may represent an investment portfolio or a fund.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SecuritiesAccount21.mmObject();
		}

		@Override
		public SecuritiesAccount21 getValue(TotalPortfolioValuationReportV01 obj) {
			return obj.getAccountDetails();
		}

		@Override
		public void setValue(TotalPortfolioValuationReportV01 obj, SecuritiesAccount21 value) {
			obj.setAccountDetails(value);
		}
	};
	@XmlElement(name = "TtlPrtflValtn", required = true)
	protected TotalPortfolioValuation1 totalPortfolioValuation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TotalPortfolioValuation1
	 * TotalPortfolioValuation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlPrtflValtn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalPortfolioValuation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Valuation information of the portfolio. In some markets a fund of funds or an investment fund is regarded as a portfolio."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<TotalPortfolioValuationReportV01, TotalPortfolioValuation1> mmTotalPortfolioValuation = new MMMessageBuildingBlock<TotalPortfolioValuationReportV01, TotalPortfolioValuation1>() {
		{
			xmlTag = "TtlPrtflValtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalPortfolioValuation";
			definition = "Valuation information of the portfolio. In some markets a fund of funds or an investment fund is regarded as a portfolio.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TotalPortfolioValuation1.mmObject();
		}

		@Override
		public TotalPortfolioValuation1 getValue(TotalPortfolioValuationReportV01 obj) {
			return obj.getTotalPortfolioValuation();
		}

		@Override
		public void setValue(TotalPortfolioValuationReportV01 obj, TotalPortfolioValuation1 value) {
			obj.setTotalPortfolioValuation(value);
		}
	};
	@XmlElement(name = "Bal")
	protected PortfolioBalance1 balance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PortfolioBalance1
	 * PortfolioBalance1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Bal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Balance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance breakdown information."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<TotalPortfolioValuationReportV01, Optional<PortfolioBalance1>> mmBalance = new MMMessageBuildingBlock<TotalPortfolioValuationReportV01, Optional<PortfolioBalance1>>() {
		{
			xmlTag = "Bal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Balance";
			definition = "Balance breakdown information.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PortfolioBalance1.mmObject();
		}

		@Override
		public Optional<PortfolioBalance1> getValue(TotalPortfolioValuationReportV01 obj) {
			return obj.getBalance();
		}

		@Override
		public void setValue(TotalPortfolioValuationReportV01 obj, Optional<PortfolioBalance1> value) {
			obj.setBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "SplmtryData")
	protected SupplementaryData1 supplementaryData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SplmtryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that can not be captured in the structured fields and/or any other specific block."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<TotalPortfolioValuationReportV01, Optional<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<TotalPortfolioValuationReportV01, Optional<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that can not be captured in the structured fields and/or any other specific block.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public Optional<SupplementaryData1> getValue(TotalPortfolioValuationReportV01 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(TotalPortfolioValuationReportV01 obj, Optional<SupplementaryData1> value) {
			obj.setSupplementaryData(value.orElse(null));
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TotalPortfolioValuationReportV01";
				definition = "Scope\r\nAn account servicer sends a TotalPortfolioValuationReport to an account owner to provide detailed valuation information for a portfolio.\r\nUsage\r\nThe TotalPortfolioValuationReport will be sent by the account servicer to the account owner on an agreed basis. The report may also be requested using a SecuritiesStatementQuery.\r\nThe TotalPortfolioValuationReport is used to report on a portfolio without Investment Funds; or to report on a portfolio when an investment fund is regarded as a portfolio containing, only one or multiple investment funds\r\nThe TotalPortfolioValuationReport may also be used to:\r\n- re-send a message previously sent (the CopyDuplicate value is DUPL),\r\n- provide a third party with a copy of a message for information (the CopyDuplicate value is COPY),\r\n- re-send to a third party a copy of a message for information (the CopyDuplicate value is CODU).";
				rootElement = "Document";
				xmlTag = "TtlPrtflValtnRpt";
				businessArea_lazy = () -> SecuritiesManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.semt.TotalPortfolioValuationReportV01.mmPagination, com.tools20022.repository.area.semt.TotalPortfolioValuationReportV01.mmReportGeneralDetails,
						com.tools20022.repository.area.semt.TotalPortfolioValuationReportV01.mmAccountDetails, com.tools20022.repository.area.semt.TotalPortfolioValuationReportV01.mmTotalPortfolioValuation,
						com.tools20022.repository.area.semt.TotalPortfolioValuationReportV01.mmBalance, com.tools20022.repository.area.semt.TotalPortfolioValuationReportV01.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "semt";
						messageFunctionality = "024";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return TotalPortfolioValuationReportV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Pagination getPagination() {
		return pagination;
	}

	public TotalPortfolioValuationReportV01 setPagination(Pagination pagination) {
		this.pagination = Objects.requireNonNull(pagination);
		return this;
	}

	public Report4 getReportGeneralDetails() {
		return reportGeneralDetails;
	}

	public TotalPortfolioValuationReportV01 setReportGeneralDetails(Report4 reportGeneralDetails) {
		this.reportGeneralDetails = Objects.requireNonNull(reportGeneralDetails);
		return this;
	}

	public SecuritiesAccount21 getAccountDetails() {
		return accountDetails;
	}

	public TotalPortfolioValuationReportV01 setAccountDetails(SecuritiesAccount21 accountDetails) {
		this.accountDetails = Objects.requireNonNull(accountDetails);
		return this;
	}

	public TotalPortfolioValuation1 getTotalPortfolioValuation() {
		return totalPortfolioValuation;
	}

	public TotalPortfolioValuationReportV01 setTotalPortfolioValuation(TotalPortfolioValuation1 totalPortfolioValuation) {
		this.totalPortfolioValuation = Objects.requireNonNull(totalPortfolioValuation);
		return this;
	}

	public Optional<PortfolioBalance1> getBalance() {
		return balance == null ? Optional.empty() : Optional.of(balance);
	}

	public TotalPortfolioValuationReportV01 setBalance(PortfolioBalance1 balance) {
		this.balance = balance;
		return this;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? Optional.empty() : Optional.of(supplementaryData);
	}

	public TotalPortfolioValuationReportV01 setSupplementaryData(SupplementaryData1 supplementaryData) {
		this.supplementaryData = supplementaryData;
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:semt.024.001.01")
	static public class Document {
		@XmlElement(name = "TtlPrtflValtnRpt", required = true)
		public TotalPortfolioValuationReportV01 messageBody;
	}
}