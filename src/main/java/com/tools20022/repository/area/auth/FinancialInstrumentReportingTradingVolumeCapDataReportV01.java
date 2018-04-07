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
import com.tools20022.repository.msg.SecuritiesMarketReportHeader1;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msg.VolumeCapReport1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * The FinancialInstrumentReportingTradingVolumeCapDataReport message is sent by
 * the trading venue to the national competent authority to report the total
 * volume of trading and volumes of trading under reference price waiver and
 * negotiated transactions waiver.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.FinancialInstrumentReportingTradingVolumeCapDataReportV01#mmReportHeader
 * FinancialInstrumentReportingTradingVolumeCapDataReportV01.mmReportHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.FinancialInstrumentReportingTradingVolumeCapDataReportV01#mmVolumeCapData
 * FinancialInstrumentReportingTradingVolumeCapDataReportV01.mmVolumeCapData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.FinancialInstrumentReportingTradingVolumeCapDataReportV01#mmSupplementaryData
 * FinancialInstrumentReportingTradingVolumeCapDataReportV01.mmSupplementaryData
 * }</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "FinInstrmRptgTradgVolCapDataRpt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.AuthoritiesLatestVersion
 * AuthoritiesLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code auth.035.001.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FinancialInstrumentReportingTradingVolumeCapDataReportV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The FinancialInstrumentReportingTradingVolumeCapDataReport message is sent by the trading venue to the national competent authority to report the total volume of trading and volumes of trading under reference price waiver and negotiated transactions waiver."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "FinancialInstrumentReportingTradingVolumeCapDataReportV01", propOrder = {"reportHeader", "volumeCapData", "supplementaryData"})
public class FinancialInstrumentReportingTradingVolumeCapDataReportV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "RptHdr", required = true)
	protected SecuritiesMarketReportHeader1 reportHeader;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesMarketReportHeader1
	 * SecuritiesMarketReportHeader1}</li>
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
	 * definition} = "Header information related to the global report."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<FinancialInstrumentReportingTradingVolumeCapDataReportV01, SecuritiesMarketReportHeader1> mmReportHeader = new MMMessageBuildingBlock<FinancialInstrumentReportingTradingVolumeCapDataReportV01, SecuritiesMarketReportHeader1>() {
		{
			xmlTag = "RptHdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportHeader";
			definition = "Header information related to the global report.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SecuritiesMarketReportHeader1.mmObject();
		}

		@Override
		public SecuritiesMarketReportHeader1 getValue(FinancialInstrumentReportingTradingVolumeCapDataReportV01 obj) {
			return obj.getReportHeader();
		}

		@Override
		public void setValue(FinancialInstrumentReportingTradingVolumeCapDataReportV01 obj, SecuritiesMarketReportHeader1 value) {
			obj.setReportHeader(value);
		}
	};
	@XmlElement(name = "VolCapData", required = true)
	protected List<VolumeCapReport1> volumeCapData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.VolumeCapReport1
	 * VolumeCapReport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VolCapData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VolumeCapData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details on the volume of trades of financial instruments."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<FinancialInstrumentReportingTradingVolumeCapDataReportV01, List<VolumeCapReport1>> mmVolumeCapData = new MMMessageBuildingBlock<FinancialInstrumentReportingTradingVolumeCapDataReportV01, List<VolumeCapReport1>>() {
		{
			xmlTag = "VolCapData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VolumeCapData";
			definition = "Provides details on the volume of trades of financial instruments.";
			minOccurs = 1;
			complexType_lazy = () -> VolumeCapReport1.mmObject();
		}

		@Override
		public List<VolumeCapReport1> getValue(FinancialInstrumentReportingTradingVolumeCapDataReportV01 obj) {
			return obj.getVolumeCapData();
		}

		@Override
		public void setValue(FinancialInstrumentReportingTradingVolumeCapDataReportV01 obj, List<VolumeCapReport1> value) {
			obj.setVolumeCapData(value);
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
	public static final MMMessageBuildingBlock<FinancialInstrumentReportingTradingVolumeCapDataReportV01, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<FinancialInstrumentReportingTradingVolumeCapDataReportV01, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that can not be captured in the structured fields and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(FinancialInstrumentReportingTradingVolumeCapDataReportV01 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(FinancialInstrumentReportingTradingVolumeCapDataReportV01 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FinancialInstrumentReportingTradingVolumeCapDataReportV01";
				definition = "The FinancialInstrumentReportingTradingVolumeCapDataReport message is sent by the trading venue to the national competent authority to report the total volume of trading and volumes of trading under reference price waiver and negotiated transactions waiver.";
				rootElement = "Document";
				xmlTag = "FinInstrmRptgTradgVolCapDataRpt";
				businessArea_lazy = () -> AuthoritiesLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.auth.FinancialInstrumentReportingTradingVolumeCapDataReportV01.mmReportHeader,
						com.tools20022.repository.area.auth.FinancialInstrumentReportingTradingVolumeCapDataReportV01.mmVolumeCapData,
						com.tools20022.repository.area.auth.FinancialInstrumentReportingTradingVolumeCapDataReportV01.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "auth";
						messageFunctionality = "035";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return FinancialInstrumentReportingTradingVolumeCapDataReportV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	public SecuritiesMarketReportHeader1 getReportHeader() {
		return reportHeader;
	}

	public FinancialInstrumentReportingTradingVolumeCapDataReportV01 setReportHeader(SecuritiesMarketReportHeader1 reportHeader) {
		this.reportHeader = Objects.requireNonNull(reportHeader);
		return this;
	}

	public List<VolumeCapReport1> getVolumeCapData() {
		return volumeCapData == null ? volumeCapData = new ArrayList<>() : volumeCapData;
	}

	public FinancialInstrumentReportingTradingVolumeCapDataReportV01 setVolumeCapData(List<VolumeCapReport1> volumeCapData) {
		this.volumeCapData = Objects.requireNonNull(volumeCapData);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public FinancialInstrumentReportingTradingVolumeCapDataReportV01 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.035.001.01")
	static public class Document {
		@XmlElement(name = "FinInstrmRptgTradgVolCapDataRpt", required = true)
		public FinancialInstrumentReportingTradingVolumeCapDataReportV01 messageBody;
	}
}