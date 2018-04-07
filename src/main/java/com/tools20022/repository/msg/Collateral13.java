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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.colr.CollateralAndExposureReportV03;
import com.tools20022.repository.entity.Collateral;
import com.tools20022.repository.entity.CollateralManagement;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CollateralAccount2;
import com.tools20022.repository.msg.CollateralValuation5;
import com.tools20022.repository.msg.Summary1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides for each collateral account the report summary and the valuation of
 * each piece of collateral.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Collateral13#mmAccountIdentification
 * Collateral13.mmAccountIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Collateral13#mmReportSummary
 * Collateral13.mmReportSummary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Collateral13#mmCollateralValuation
 * Collateral13.mmCollateralValuation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Collateral Collateral}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralAndExposureReportV03#mmCollateralReport
 * CollateralAndExposureReportV03.mmCollateralReport}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Collateral13"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides for each collateral account the report summary and the valuation of each piece of collateral."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Collateral13", propOrder = {"accountIdentification", "reportSummary", "collateralValuation"})
public class Collateral13 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AcctId", required = true)
	protected CollateralAccount2 accountIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CollateralAccount2
	 * CollateralAccount2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Collateral#mmCollateralAccount
	 * Collateral.mmCollateralAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Collateral13 Collateral13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about the collateral account, that is the identification, the type and optionally the name."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Collateral13, CollateralAccount2> mmAccountIdentification = new MMMessageAssociationEnd<Collateral13, CollateralAccount2>() {
		{
			businessElementTrace_lazy = () -> Collateral.mmCollateralAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.Collateral13.mmObject();
			isDerived = false;
			xmlTag = "AcctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentification";
			definition = "Provides information about the collateral account, that is the identification, the type and optionally the name.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CollateralAccount2.mmObject();
		}

		@Override
		public CollateralAccount2 getValue(Collateral13 obj) {
			return obj.getAccountIdentification();
		}

		@Override
		public void setValue(Collateral13 obj, CollateralAccount2 value) {
			obj.setAccountIdentification(value);
		}
	};
	@XmlElement(name = "RptSummry", required = true)
	protected Summary1 reportSummary;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Summary1 Summary1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Collateral13 Collateral13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptSummry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportSummary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the summary of the collateral valuation report."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Collateral13, Summary1> mmReportSummary = new MMMessageAssociationEnd<Collateral13, Summary1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Collateral13.mmObject();
			isDerived = false;
			xmlTag = "RptSummry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportSummary";
			definition = "Provides the summary of the collateral valuation report.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Summary1.mmObject();
		}

		@Override
		public Summary1 getValue(Collateral13 obj) {
			return obj.getReportSummary();
		}

		@Override
		public void setValue(Collateral13 obj, Summary1 value) {
			obj.setReportSummary(value);
		}
	};
	@XmlElement(name = "CollValtn")
	protected List<CollateralValuation5> collateralValuation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CollateralValuation5
	 * CollateralValuation5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CollateralManagement#mmCollateralValuation
	 * CollateralManagement.mmCollateralValuation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Collateral13 Collateral13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CollValtn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralValuation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides additionnal information about the collateral valuation that has been posted."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Collateral13, List<CollateralValuation5>> mmCollateralValuation = new MMMessageAssociationEnd<Collateral13, List<CollateralValuation5>>() {
		{
			businessElementTrace_lazy = () -> CollateralManagement.mmCollateralValuation;
			componentContext_lazy = () -> com.tools20022.repository.msg.Collateral13.mmObject();
			isDerived = false;
			xmlTag = "CollValtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralValuation";
			definition = "Provides additionnal information about the collateral valuation that has been posted.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CollateralValuation5.mmObject();
		}

		@Override
		public List<CollateralValuation5> getValue(Collateral13 obj) {
			return obj.getCollateralValuation();
		}

		@Override
		public void setValue(Collateral13 obj, List<CollateralValuation5> value) {
			obj.setCollateralValuation(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Collateral13.mmAccountIdentification, com.tools20022.repository.msg.Collateral13.mmReportSummary,
						com.tools20022.repository.msg.Collateral13.mmCollateralValuation);
				messageBuildingBlock_lazy = () -> Arrays.asList(CollateralAndExposureReportV03.mmCollateralReport);
				trace_lazy = () -> Collateral.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Collateral13";
				definition = "Provides for each collateral account the report summary and the valuation of each piece of collateral.";
			}
		});
		return mmObject_lazy.get();
	}

	public CollateralAccount2 getAccountIdentification() {
		return accountIdentification;
	}

	public Collateral13 setAccountIdentification(CollateralAccount2 accountIdentification) {
		this.accountIdentification = Objects.requireNonNull(accountIdentification);
		return this;
	}

	public Summary1 getReportSummary() {
		return reportSummary;
	}

	public Collateral13 setReportSummary(Summary1 reportSummary) {
		this.reportSummary = Objects.requireNonNull(reportSummary);
		return this;
	}

	public List<CollateralValuation5> getCollateralValuation() {
		return collateralValuation == null ? collateralValuation = new ArrayList<>() : collateralValuation;
	}

	public Collateral13 setCollateralValuation(List<CollateralValuation5> collateralValuation) {
		this.collateralValuation = Objects.requireNonNull(collateralValuation);
		return this;
	}
}