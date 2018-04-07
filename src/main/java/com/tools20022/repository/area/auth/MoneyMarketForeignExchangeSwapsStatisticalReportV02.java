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

package com.tools20022.repository.area.auth;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.AuthoritiesLatestVersion;
import com.tools20022.repository.choice.ForeignExchangeSwap3Choice;
import com.tools20022.repository.msg.MoneyMarketReportHeader1;
import com.tools20022.repository.msg.SupplementaryData1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * The MoneyMarketSecuredMarketStatisticalReport message is sent by the
 * reporting agents to the relevant competent authority, to report all daily
 * Foreign Exchange Swaps (FX Swaps) transactions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.MoneyMarketForeignExchangeSwapsStatisticalReportV02#mmReportHeader
 * MoneyMarketForeignExchangeSwapsStatisticalReportV02.mmReportHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.MoneyMarketForeignExchangeSwapsStatisticalReportV02#mmForeignExchangeSwapsReport
 * MoneyMarketForeignExchangeSwapsStatisticalReportV02.
 * mmForeignExchangeSwapsReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.MoneyMarketForeignExchangeSwapsStatisticalReportV02#mmSupplementaryData
 * MoneyMarketForeignExchangeSwapsStatisticalReportV02.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "MnyMktFXSwpsSttstclRpt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.AuthoritiesLatestVersion
 * AuthoritiesLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code auth.014.001.02}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MoneyMarketForeignExchangeSwapsStatisticalReportV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The MoneyMarketSecuredMarketStatisticalReport message is sent by the reporting agents to the relevant competent authority, to report all daily Foreign Exchange Swaps (FX Swaps) transactions."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MoneyMarketForeignExchangeSwapsStatisticalReportV02", propOrder = {"reportHeader", "foreignExchangeSwapsReport", "supplementaryData"})
public class MoneyMarketForeignExchangeSwapsStatisticalReportV02 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "RptHdr", required = true)
	protected MoneyMarketReportHeader1 reportHeader;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MoneyMarketReportHeader1
	 * MoneyMarketReportHeader1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptHdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportHeader"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the elements specific to the report."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MoneyMarketForeignExchangeSwapsStatisticalReportV02, MoneyMarketReportHeader1> mmReportHeader = new MMMessageBuildingBlock<MoneyMarketForeignExchangeSwapsStatisticalReportV02, MoneyMarketReportHeader1>() {
		{
			xmlTag = "RptHdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportHeader";
			definition = "Provides the elements specific to the report.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MoneyMarketReportHeader1.mmObject();
		}

		@Override
		public MoneyMarketReportHeader1 getValue(MoneyMarketForeignExchangeSwapsStatisticalReportV02 obj) {
			return obj.getReportHeader();
		}

		@Override
		public void setValue(MoneyMarketForeignExchangeSwapsStatisticalReportV02 obj, MoneyMarketReportHeader1 value) {
			obj.setReportHeader(value);
		}
	};
	@XmlElement(name = "FXSwpsRpt", required = true)
	protected ForeignExchangeSwap3Choice foreignExchangeSwapsReport;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.ForeignExchangeSwap3Choice
	 * ForeignExchangeSwap3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FXSwpsRpt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignExchangeSwapsReport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the reason why no activity is reported or the required list of transactions for the foreign exchange swaps segment."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MoneyMarketForeignExchangeSwapsStatisticalReportV02, ForeignExchangeSwap3Choice> mmForeignExchangeSwapsReport = new MMMessageBuildingBlock<MoneyMarketForeignExchangeSwapsStatisticalReportV02, ForeignExchangeSwap3Choice>() {
		{
			xmlTag = "FXSwpsRpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignExchangeSwapsReport";
			definition = "Provides the reason why no activity is reported or the required list of transactions for the foreign exchange swaps segment.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> ForeignExchangeSwap3Choice.mmObject();
		}

		@Override
		public ForeignExchangeSwap3Choice getValue(MoneyMarketForeignExchangeSwapsStatisticalReportV02 obj) {
			return obj.getForeignExchangeSwapsReport();
		}

		@Override
		public void setValue(MoneyMarketForeignExchangeSwapsStatisticalReportV02 obj, ForeignExchangeSwap3Choice value) {
			obj.setForeignExchangeSwapsReport(value);
		}
	};
	@XmlElement(name = "SplmtryData")
	protected List<SupplementaryData1> supplementaryData;
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
	public static final MMMessageBuildingBlock<MoneyMarketForeignExchangeSwapsStatisticalReportV02, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<MoneyMarketForeignExchangeSwapsStatisticalReportV02, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that can not be captured in the structured fields and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(MoneyMarketForeignExchangeSwapsStatisticalReportV02 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(MoneyMarketForeignExchangeSwapsStatisticalReportV02 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MoneyMarketForeignExchangeSwapsStatisticalReportV02";
				definition = "The MoneyMarketSecuredMarketStatisticalReport message is sent by the reporting agents to the relevant competent authority, to report all daily Foreign Exchange Swaps (FX Swaps) transactions.";
				rootElement = "Document";
				xmlTag = "MnyMktFXSwpsSttstclRpt";
				businessArea_lazy = () -> AuthoritiesLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.auth.MoneyMarketForeignExchangeSwapsStatisticalReportV02.mmReportHeader,
						com.tools20022.repository.area.auth.MoneyMarketForeignExchangeSwapsStatisticalReportV02.mmForeignExchangeSwapsReport,
						com.tools20022.repository.area.auth.MoneyMarketForeignExchangeSwapsStatisticalReportV02.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "auth";
						messageFunctionality = "014";
						version = "02";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return MoneyMarketForeignExchangeSwapsStatisticalReportV02.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MoneyMarketReportHeader1 getReportHeader() {
		return reportHeader;
	}

	public MoneyMarketForeignExchangeSwapsStatisticalReportV02 setReportHeader(MoneyMarketReportHeader1 reportHeader) {
		this.reportHeader = Objects.requireNonNull(reportHeader);
		return this;
	}

	public ForeignExchangeSwap3Choice getForeignExchangeSwapsReport() {
		return foreignExchangeSwapsReport;
	}

	public MoneyMarketForeignExchangeSwapsStatisticalReportV02 setForeignExchangeSwapsReport(ForeignExchangeSwap3Choice foreignExchangeSwapsReport) {
		this.foreignExchangeSwapsReport = Objects.requireNonNull(foreignExchangeSwapsReport);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public MoneyMarketForeignExchangeSwapsStatisticalReportV02 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.014.001.02")
	static public class Document {
		@XmlElement(name = "MnyMktFXSwpsSttstclRpt", required = true)
		public MoneyMarketForeignExchangeSwapsStatisticalReportV02 messageBody;
	}
}