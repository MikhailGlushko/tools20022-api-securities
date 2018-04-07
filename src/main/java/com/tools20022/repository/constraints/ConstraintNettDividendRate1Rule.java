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

package com.tools20022.repository.constraints;

import com.tools20022.core.repo.NotImplementedConstraintException;
import com.tools20022.metamodel.MMConstraint;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.msg.CorporateActionRate88;

/**
 * If NetDividendRate is repeated, then
 * RateTypeAndAmountAndRateStatus/RateType/Code values must all be different in
 * each occurrence of NetDividendRate. (MT 566 NVR C4 ).
 */
public class ConstraintNettDividendRate1Rule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate88
	 * CorporateActionRate88}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NettDividendRate1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If NetDividendRate is repeated, then RateTypeAndAmountAndRateStatus/RateType/Code values must all be different in each occurrence of NetDividendRate. (MT 566 NVR C4 )."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate88> forCorporateActionRate88 = new MMConstraint<CorporateActionRate88>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NettDividendRate1Rule";
			definition = "If NetDividendRate is repeated, then RateTypeAndAmountAndRateStatus/RateType/Code values must all be different in each occurrence of NetDividendRate. (MT 566 NVR C4 ).";
			owner_lazy = () -> CorporateActionRate88.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionRate88 obj) throws Exception {
			checkCorporateActionRate88(obj);
		}
	};

	/**
	 * If NetDividendRate is repeated, then
	 * RateTypeAndAmountAndRateStatus/RateType/Code values must all be different
	 * in each occurrence of NetDividendRate. (MT 566 NVR C4 ).
	 */
	public static void checkCorporateActionRate88(CorporateActionRate88 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}