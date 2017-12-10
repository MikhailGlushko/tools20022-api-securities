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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.CreditDefaultSwap;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CreditDefaultSwapDerivative3;
import com.tools20022.repository.msg.CreditDefaultSwapDerivative4;
import com.tools20022.repository.msg.CreditDefaultSwapIndex2;
import com.tools20022.repository.msg.CreditDefaultSwapSingleName2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice structure allowing a credit default swap derivative to be defined.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CreditDefaultSwapsDerivative3Choice#mmSingleNameCreditDefaultSwap
 * CreditDefaultSwapsDerivative3Choice.mmSingleNameCreditDefaultSwap}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CreditDefaultSwapsDerivative3Choice#mmCreditDefaultSwapIndex
 * CreditDefaultSwapsDerivative3Choice.mmCreditDefaultSwapIndex}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CreditDefaultSwapsDerivative3Choice#mmSingleNameCreditDefaultSwapDerivative
 * CreditDefaultSwapsDerivative3Choice.mmSingleNameCreditDefaultSwapDerivative}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CreditDefaultSwapsDerivative3Choice#mmCreditDefaultSwapIndexDerivative
 * CreditDefaultSwapsDerivative3Choice.mmCreditDefaultSwapIndexDerivative}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CreditDefaultSwap
 * CreditDefaultSwap}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CreditDefaultSwapsDerivative3Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice structure allowing a credit default swap derivative to be defined."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CreditDefaultSwapsDerivative3Choice", propOrder = {"singleNameCreditDefaultSwap", "creditDefaultSwapIndex", "singleNameCreditDefaultSwapDerivative", "creditDefaultSwapIndexDerivative"})
public class CreditDefaultSwapsDerivative3Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected CreditDefaultSwapSingleName2 singleNameCreditDefaultSwap;
	/**
	 * A credit default swap on a single name instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CreditDefaultSwapSingleName2
	 * CreditDefaultSwapSingleName2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CreditDefaultSwap
	 * CreditDefaultSwap}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CreditDefaultSwapsDerivative3Choice
	 * CreditDefaultSwapsDerivative3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SnglNmCdtDfltSwp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SingleNameCreditDefaultSwap"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "A credit default swap on a single name instrument."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSingleNameCreditDefaultSwap = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CreditDefaultSwap.mmObject();
			componentContext_lazy = () -> CreditDefaultSwapsDerivative3Choice.mmObject();
			isDerived = false;
			xmlTag = "SnglNmCdtDfltSwp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SingleNameCreditDefaultSwap";
			definition = "A credit default swap on a single name instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CreditDefaultSwapSingleName2.mmObject();
		}
	};
	protected CreditDefaultSwapIndex2 creditDefaultSwapIndex;
	/**
	 * A credit default swap on an index.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CreditDefaultSwapIndex2
	 * CreditDefaultSwapIndex2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CreditDefaultSwap
	 * CreditDefaultSwap}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CreditDefaultSwapsDerivative3Choice
	 * CreditDefaultSwapsDerivative3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtDfltSwpIndx"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditDefaultSwapIndex"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "A credit default swap on an index."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCreditDefaultSwapIndex = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CreditDefaultSwap.mmObject();
			componentContext_lazy = () -> CreditDefaultSwapsDerivative3Choice.mmObject();
			isDerived = false;
			xmlTag = "CdtDfltSwpIndx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditDefaultSwapIndex";
			definition = "A credit default swap on an index.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CreditDefaultSwapIndex2.mmObject();
		}
	};
	protected CreditDefaultSwapDerivative4 singleNameCreditDefaultSwapDerivative;
	/**
	 * A credit default swap derivative on a single name.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CreditDefaultSwapDerivative4
	 * CreditDefaultSwapDerivative4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CreditDefaultSwap
	 * CreditDefaultSwap}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CreditDefaultSwapsDerivative3Choice
	 * CreditDefaultSwapsDerivative3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SnglNmCdtDfltSwpDeriv"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SingleNameCreditDefaultSwapDerivative"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "A credit default swap derivative on a single name."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSingleNameCreditDefaultSwapDerivative = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CreditDefaultSwap.mmObject();
			componentContext_lazy = () -> CreditDefaultSwapsDerivative3Choice.mmObject();
			isDerived = false;
			xmlTag = "SnglNmCdtDfltSwpDeriv";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SingleNameCreditDefaultSwapDerivative";
			definition = "A credit default swap derivative on a single name.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CreditDefaultSwapDerivative4.mmObject();
		}
	};
	protected CreditDefaultSwapDerivative3 creditDefaultSwapIndexDerivative;
	/**
	 * A credit default swap derivative on an index.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CreditDefaultSwapDerivative3
	 * CreditDefaultSwapDerivative3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CreditDefaultSwap
	 * CreditDefaultSwap}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CreditDefaultSwapsDerivative3Choice
	 * CreditDefaultSwapsDerivative3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtDfltSwpIndxDeriv"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditDefaultSwapIndexDerivative"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "A credit default swap derivative on an index."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCreditDefaultSwapIndexDerivative = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CreditDefaultSwap.mmObject();
			componentContext_lazy = () -> CreditDefaultSwapsDerivative3Choice.mmObject();
			isDerived = false;
			xmlTag = "CdtDfltSwpIndxDeriv";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditDefaultSwapIndexDerivative";
			definition = "A credit default swap derivative on an index.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CreditDefaultSwapDerivative3.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CreditDefaultSwapsDerivative3Choice.mmSingleNameCreditDefaultSwap, CreditDefaultSwapsDerivative3Choice.mmCreditDefaultSwapIndex,
						CreditDefaultSwapsDerivative3Choice.mmSingleNameCreditDefaultSwapDerivative, CreditDefaultSwapsDerivative3Choice.mmCreditDefaultSwapIndexDerivative);
				trace_lazy = () -> CreditDefaultSwap.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CreditDefaultSwapsDerivative3Choice";
				definition = "Choice structure allowing a credit default swap derivative to be defined.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "SnglNmCdtDfltSwp", required = true)
	public CreditDefaultSwapSingleName2 getSingleNameCreditDefaultSwap() {
		return singleNameCreditDefaultSwap;
	}

	public void setSingleNameCreditDefaultSwap(CreditDefaultSwapSingleName2 singleNameCreditDefaultSwap) {
		this.singleNameCreditDefaultSwap = singleNameCreditDefaultSwap;
	}

	@XmlElement(name = "CdtDfltSwpIndx", required = true)
	public CreditDefaultSwapIndex2 getCreditDefaultSwapIndex() {
		return creditDefaultSwapIndex;
	}

	public void setCreditDefaultSwapIndex(CreditDefaultSwapIndex2 creditDefaultSwapIndex) {
		this.creditDefaultSwapIndex = creditDefaultSwapIndex;
	}

	@XmlElement(name = "SnglNmCdtDfltSwpDeriv", required = true)
	public CreditDefaultSwapDerivative4 getSingleNameCreditDefaultSwapDerivative() {
		return singleNameCreditDefaultSwapDerivative;
	}

	public void setSingleNameCreditDefaultSwapDerivative(CreditDefaultSwapDerivative4 singleNameCreditDefaultSwapDerivative) {
		this.singleNameCreditDefaultSwapDerivative = singleNameCreditDefaultSwapDerivative;
	}

	@XmlElement(name = "CdtDfltSwpIndxDeriv", required = true)
	public CreditDefaultSwapDerivative3 getCreditDefaultSwapIndexDerivative() {
		return creditDefaultSwapIndexDerivative;
	}

	public void setCreditDefaultSwapIndexDerivative(CreditDefaultSwapDerivative3 creditDefaultSwapIndexDerivative) {
		this.creditDefaultSwapIndexDerivative = creditDefaultSwapIndexDerivative;
	}
}