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
import com.tools20022.repository.msg.SecuritiesIndexReport1;
import com.tools20022.repository.msg.SecuritiesMarketReportHeader1;
import com.tools20022.repository.msg.SupplementaryData1;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.*;

/**
 * This FinancialInstrumentReportingReferenceDataIndexReport message is sent by
 * National Competent Authorities to express an interest in receiving data on
 * European indices.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.FinancialInstrumentReportingReferenceDataIndexReportV01#mmReportHeader
 * FinancialInstrumentReportingReferenceDataIndexReportV01.mmReportHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.FinancialInstrumentReportingReferenceDataIndexReportV01#mmIndexData
 * FinancialInstrumentReportingReferenceDataIndexReportV01.mmIndexData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.FinancialInstrumentReportingReferenceDataIndexReportV01#mmSupplementaryData
 * FinancialInstrumentReportingReferenceDataIndexReportV01.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "FinInstrmRptgRefDataIndxRpt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.AuthoritiesLatestVersion
 * AuthoritiesLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code auth.043.001.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FinancialInstrumentReportingReferenceDataIndexReportV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "This FinancialInstrumentReportingReferenceDataIndexReport message is sent by National Competent Authorities to express an interest in receiving data on European indices."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "FinancialInstrumentReportingReferenceDataIndexReportV01", propOrder = {"reportHeader", "indexData", "supplementaryData"})
public class FinancialInstrumentReportingReferenceDataIndexReportV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected SecuritiesMarketReportHeader1 reportHeader;
	/**
	 * Header information related to the global report, common to all reference
	 * data.
	 * <p>
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
	 * definition} =
	 * "Header information related to the global report, common to all reference data."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmReportHeader = new MMMessageBuildingBlock() {
		{
			xmlTag = "RptHdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportHeader";
			definition = "Header information related to the global report, common to all reference data.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SecuritiesMarketReportHeader1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return FinancialInstrumentReportingReferenceDataIndexReportV01.class.getMethod("getReportHeader", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<SecuritiesIndexReport1> indexData;
	/**
	 * Details of specific financial instruments a National Competent Authority
	 * wishes to express an interest in receiving transaction reports on.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesIndexReport1
	 * SecuritiesIndexReport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IndxData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndexData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details of specific financial instruments a National Competent Authority wishes to express an interest in receiving transaction reports on."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmIndexData = new MMMessageBuildingBlock() {
		{
			xmlTag = "IndxData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndexData";
			definition = "Details of specific financial instruments a National Competent Authority wishes to express an interest in receiving transaction reports on.";
			minOccurs = 1;
			complexType_lazy = () -> SecuritiesIndexReport1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return FinancialInstrumentReportingReferenceDataIndexReportV01.class.getMethod("getIndexData", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * Additional information that can not be captured in the structured fields
	 * and/or any other specific block.
	 * <p>
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
	public static final MMMessageBuildingBlock mmSupplementaryData = new MMMessageBuildingBlock() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that can not be captured in the structured fields and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return FinancialInstrumentReportingReferenceDataIndexReportV01.class.getMethod("getSupplementaryData", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FinancialInstrumentReportingReferenceDataIndexReportV01";
				definition = "This FinancialInstrumentReportingReferenceDataIndexReport message is sent by National Competent Authorities to express an interest in receiving data on European indices.";
				rootElement = "Document";
				xmlTag = "FinInstrmRptgRefDataIndxRpt";
				businessArea_lazy = () -> AuthoritiesLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.auth.FinancialInstrumentReportingReferenceDataIndexReportV01.mmReportHeader,
						com.tools20022.repository.area.auth.FinancialInstrumentReportingReferenceDataIndexReportV01.mmIndexData,
						com.tools20022.repository.area.auth.FinancialInstrumentReportingReferenceDataIndexReportV01.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "auth";
						messageFunctionality = "043";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return FinancialInstrumentReportingReferenceDataIndexReportV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "RptHdr", required = true)
	public SecuritiesMarketReportHeader1 getReportHeader() {
		return reportHeader;
	}

	public void setReportHeader(SecuritiesMarketReportHeader1 reportHeader) {
		this.reportHeader = reportHeader;
	}

	@XmlElement(name = "IndxData", required = true)
	public List<SecuritiesIndexReport1> getIndexData() {
		return indexData;
	}

	public void setIndexData(List<SecuritiesIndexReport1> indexData) {
		this.indexData = indexData;
	}

	@XmlElement(name = "SplmtryData")
	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData;
	}

	public void setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = supplementaryData;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:auth.043.01.01")
	static public class Document {
		@XmlElement(name = "FinInstrmRptgRefDataIndxRpt", required = true)
		public FinancialInstrumentReportingReferenceDataIndexReportV01 messageBody;
	}
}