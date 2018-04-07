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
import com.tools20022.repository.msg.SecuritiesInstrumentClassification2;
import com.tools20022.repository.msg.SupplementaryData1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * The FinancialInstrumentReportingInstrumentClassificationReport message is
 * sent by ESMA to all national competent authorities and provides all valid
 * combinations for classification of financial instruments (CFI) as per ISO
 * 10962.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.FinancialInstrumentReportingInstrumentClassificationReportV01#mmInstrumentClassification
 * FinancialInstrumentReportingInstrumentClassificationReportV01.
 * mmInstrumentClassification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.FinancialInstrumentReportingInstrumentClassificationReportV01#mmSupplementaryData
 * FinancialInstrumentReportingInstrumentClassificationReportV01.
 * mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "FinInstrmRptgInstrmClssfctnRpt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.AuthoritiesLatestVersion
 * AuthoritiesLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code auth.050.001.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FinancialInstrumentReportingInstrumentClassificationReportV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The FinancialInstrumentReportingInstrumentClassificationReport message is sent by ESMA to all national competent authorities and provides all valid combinations for classification of financial instruments (CFI) as per ISO 10962."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "FinancialInstrumentReportingInstrumentClassificationReportV01", propOrder = {"instrumentClassification", "supplementaryData"})
public class FinancialInstrumentReportingInstrumentClassificationReportV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "InstrmClssfctn", required = true)
	protected List<SecuritiesInstrumentClassification2> instrumentClassification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesInstrumentClassification2
	 * SecuritiesInstrumentClassification2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrmClssfctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstrumentClassification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Report detailing all classification for financial instruments (CFI) code."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<FinancialInstrumentReportingInstrumentClassificationReportV01, List<SecuritiesInstrumentClassification2>> mmInstrumentClassification = new MMMessageBuildingBlock<FinancialInstrumentReportingInstrumentClassificationReportV01, List<SecuritiesInstrumentClassification2>>() {
		{
			xmlTag = "InstrmClssfctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstrumentClassification";
			definition = "Report detailing all classification for financial instruments (CFI) code.";
			minOccurs = 1;
			complexType_lazy = () -> SecuritiesInstrumentClassification2.mmObject();
		}

		@Override
		public List<SecuritiesInstrumentClassification2> getValue(FinancialInstrumentReportingInstrumentClassificationReportV01 obj) {
			return obj.getInstrumentClassification();
		}

		@Override
		public void setValue(FinancialInstrumentReportingInstrumentClassificationReportV01 obj, List<SecuritiesInstrumentClassification2> value) {
			obj.setInstrumentClassification(value);
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
	public static final MMMessageBuildingBlock<FinancialInstrumentReportingInstrumentClassificationReportV01, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<FinancialInstrumentReportingInstrumentClassificationReportV01, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that can not be captured in the structured fields and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(FinancialInstrumentReportingInstrumentClassificationReportV01 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(FinancialInstrumentReportingInstrumentClassificationReportV01 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FinancialInstrumentReportingInstrumentClassificationReportV01";
				definition = "The FinancialInstrumentReportingInstrumentClassificationReport message is sent by ESMA to all national competent authorities and provides all valid combinations for classification of financial instruments (CFI) as per ISO 10962.";
				rootElement = "Document";
				xmlTag = "FinInstrmRptgInstrmClssfctnRpt";
				businessArea_lazy = () -> AuthoritiesLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.auth.FinancialInstrumentReportingInstrumentClassificationReportV01.mmInstrumentClassification,
						com.tools20022.repository.area.auth.FinancialInstrumentReportingInstrumentClassificationReportV01.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "auth";
						messageFunctionality = "050";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return FinancialInstrumentReportingInstrumentClassificationReportV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<SecuritiesInstrumentClassification2> getInstrumentClassification() {
		return instrumentClassification == null ? instrumentClassification = new ArrayList<>() : instrumentClassification;
	}

	public FinancialInstrumentReportingInstrumentClassificationReportV01 setInstrumentClassification(List<SecuritiesInstrumentClassification2> instrumentClassification) {
		this.instrumentClassification = Objects.requireNonNull(instrumentClassification);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public FinancialInstrumentReportingInstrumentClassificationReportV01 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.050.001.01")
	static public class Document {
		@XmlElement(name = "FinInstrmRptgInstrmClssfctnRpt", required = true)
		public FinancialInstrumentReportingInstrumentClassificationReportV01 messageBody;
	}
}