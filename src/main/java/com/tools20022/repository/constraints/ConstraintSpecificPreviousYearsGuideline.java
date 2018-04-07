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
import com.tools20022.repository.choice.PreviousYear2Choice;
import com.tools20022.repository.msg.PreviousYear2;

/**
 * SpecificPreviousYears must not contain the current year.
 */
public class ConstraintSpecificPreviousYearsGuideline {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.PreviousYear2Choice
	 * PreviousYear2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecificPreviousYearsGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "SpecificPreviousYears must not contain the current year."</li>
	 * </ul>
	 */
	public static final MMConstraint<PreviousYear2Choice> forPreviousYear2Choice = new MMConstraint<PreviousYear2Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecificPreviousYearsGuideline";
			definition = "SpecificPreviousYears must not contain the current year.";
			owner_lazy = () -> PreviousYear2Choice.mmObject();
		}

		@Override
		public void executeValidator(PreviousYear2Choice obj) throws Exception {
			checkPreviousYear2Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PreviousYear2 PreviousYear2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecificPreviousYearsGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "SpecificPreviousYears must not contain the current year."</li>
	 * </ul>
	 */
	public static final MMConstraint<PreviousYear2> forPreviousYear2 = new MMConstraint<PreviousYear2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecificPreviousYearsGuideline";
			definition = "SpecificPreviousYears must not contain the current year.";
			owner_lazy = () -> PreviousYear2.mmObject();
		}

		@Override
		public void executeValidator(PreviousYear2 obj) throws Exception {
			checkPreviousYear2(obj);
		}
	};

	/**
	 * SpecificPreviousYears must not contain the current year.
	 */
	public static void checkPreviousYear2Choice(PreviousYear2Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * SpecificPreviousYears must not contain the current year.
	 */
	public static void checkPreviousYear2(PreviousYear2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}